package parvez.alam.logger;

import io.micrometer.observation.Observation.Context;
import io.micrometer.observation.ObservationHandler;
import lombok.extern.slf4j.Slf4j;
import parvez.alam.util.UtilHelper;

import java.util.Objects;

@Slf4j
public class SimpleLoggingHandler implements ObservationHandler<Context> {

    UtilHelper utilHelper = new UtilHelper();

    @Override
    public boolean supportsContext(Context context) {
        return true;
    }

    @Override
    public void onStart(Context context) {
        log.info("Starting : {}",context.getName() );
        context.put("time : ", utilHelper.currentTimeFormatted());
        ObservationHandler.super.onStart(context);
    }

    @Override
    public void onScopeOpened(Context context) {
        log.info("Opened: {}", context.getName() );
        ObservationHandler.super.onScopeOpened(context);
    }

    @Override
    public void onScopeClosed(Context context) {
        log.info("Stopping: {} duration: {} ", context.getName(),
                utilHelper.currentTimeFormatted() -
                        context.getOrDefault("time", 0L));
        ObservationHandler.super.onScopeClosed(context);
    }

    @Override
    public void onStop(Context context) {
        log.info("Stopping : {}",context.getName() );
        ObservationHandler.super.onStop(context);
    }

    @Override
    public void onError(Context context) {
        log.info("Error : {}", Objects.requireNonNull(context.getError()).getMessage());
        ObservationHandler.super.onError(context);
    }
}
