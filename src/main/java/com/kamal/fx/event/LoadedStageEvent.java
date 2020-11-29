package com.kamal.fx.event;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class LoadedStageEvent extends ApplicationEvent {
    public LoadedStageEvent(Stage stage) {
        super(stage);
    }

    public Stage getStage() {
        return ((Stage) getSource());
    }
}
