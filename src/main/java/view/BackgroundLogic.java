import javafx.application.Platform;
import view.PetView;

public class BackgroundLogic {
    private PetView view;

    public BackgroundLogic(PetView view) {
        this.view = view;
    }

    public void updateView(double x, double y) {
        new Thread(() -> {

            Platform.runLater(() -> view.displayPet(x,y));
        }).start();
    }
}

