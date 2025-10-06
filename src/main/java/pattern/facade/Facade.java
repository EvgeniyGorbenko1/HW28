package pattern.facade;

public class Facade {
    private ButtonStart buttonStart;
    private Idea idea;

    public Facade() {
        buttonStart = new ButtonStart();
        idea = new Idea();
    }
    public void start() {
        buttonStart.start();
        idea.start();
    }
    public void stop() {
        buttonStart.stop();
        idea.stop();
    }
}
