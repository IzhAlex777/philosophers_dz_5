import java.util.List;

public class PhilosopherMain {

  public static void main(String[] args) {
    Philosopher philosopher1 = new Philosopher(1);
    Philosopher philosopher2 = new Philosopher(2);
    Philosopher philosopher3 = new Philosopher(3);
    Philosopher philosopher4 = new Philosopher(4);
    Philosopher philosopher5 = new Philosopher(5);
    Philosopher philosopher6 = new Philosopher(6);
    ActionsOfPhilosophers actionsOfPhilosophers = new ActionsOfPhilosophers();
    List<Philosopher> philosopherList = List.of(
        philosopher1,philosopher2,philosopher3,philosopher4,philosopher5,philosopher6);
    actionsOfPhilosophers.lifeOfPhilosophers(philosopherList);
  }

}
