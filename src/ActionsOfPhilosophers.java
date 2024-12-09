import java.util.List;
import java.util.Random;

public class ActionsOfPhilosophers {
  int count =0;
  public void lifeOfPhilosophers(List<Philosopher> philosopher){
    for (Philosopher p : philosopher){
      int  randomFork = new Random().nextInt(6) + 1;
      if(randomFork >= 3){
        Runnable task = () -> {
          ActionsOfPhilosophers actionsOfPhilosophers = new ActionsOfPhilosophers();
          try {
            actionsOfPhilosophers.recursDrive(0, p);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        };
        Thread thread = new Thread(task);
        thread.start();
      }else {
        Runnable task = () -> {
          ActionsOfPhilosophers actionsOfPhilosophers = new ActionsOfPhilosophers();
          try {
            actionsOfPhilosophers.recursDrive(1,p);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        };
        Thread thread = new Thread(task);
        thread.start();
      }
    }
  }

  public void recursDrive( int fork, Philosopher philosopher) throws InterruptedException {
      int forkHand = fork;
      if (forkHand == 0) {
        System.out.println("Я думаю. Philosopher :" +philosopher.getNumberPhilosopher());
        forkHand++;
        System.out.println("В руке вилок : " + forkHand + " Philosopher :" +philosopher.getNumberPhilosopher());
      }else if (forkHand == 2 ){
        System.out.println("Я ем." + " Philosopher :" +philosopher.getNumberPhilosopher());
        forkHand = 0;
        System.out.println("В руке вилок : " + forkHand + " Philosopher :" +philosopher.getNumberPhilosopher());
        System.out.println("Начинаю есть." + " Philosopher :" +philosopher.getNumberPhilosopher());
      }else{
        System.out.println("Я ем."+ " Philosopher :" +philosopher.getNumberPhilosopher());
        System.out.println("Беру вилку : " + forkHand + " Philosopher :" +philosopher.getNumberPhilosopher());
        forkHand++;
        System.out.println("В руке вилок : " + forkHand + " Philosopher :" +philosopher.getNumberPhilosopher());
      }
      if (count < 5){
        int circle = count+1;
        System.out.println("Круг :" + circle);
        Thread.sleep(1000L);
        count++;
        recursDrive(forkHand, philosopher);

      }
  }
}
