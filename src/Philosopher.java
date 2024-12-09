public class Philosopher {
  private int numberPhilosopher = 0;

  public Philosopher() {
  }

  public Philosopher(int numberPhilosopher) {
    this.numberPhilosopher = numberPhilosopher;
  }

  public int getNumberPhilosopher() {
    return numberPhilosopher;
  }

  @Override
  public String toString() {
    return "Philosopher{" +
        "numberPhilosopher=" + numberPhilosopher +
        '}';
  }
}
