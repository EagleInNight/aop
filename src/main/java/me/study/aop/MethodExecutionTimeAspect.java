package me.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Władysław Kapciuk
 */
@Aspect
public class MethodExecutionTimeAspect {

    @Pointcut("@annotation(timed)")
    public void callAt(Timed timed) {
    }

    @Around(value = "callAt(timed)", argNames = "pjp,timed")
    public Object around(ProceedingJoinPoint pjp,
                         Timed timed) throws Throwable {
        Instant start = Instant.now();

        Object result = pjp.proceed();

        long spentTime = Duration.between(start, Instant.now()).toMillis();
        if (spentTime > timed.measure()) {
            StringBuilder params = new StringBuilder();
            for (int i = 0; i < timed.paramNames().length; i++) {
                params.append(" ").append(timed.paramNames()[i]).append(" ").append(pjp.getArgs()[i]);
            }
            final String message = String.format(
                    "TIME TRACKING TOO LONG::: %s TOOK %s ms.%s",
                    pjp.getSignature().getName(),
                    spentTime,
                    params
            );

            System.out.println(message);
        }

        return result;
    }
}
