public class Runner {
    public static void main(String[] args){
        FrogSim frog1 = new FrogSim(30,  5);
        FrogSim frog2 = new FrogSim(50,  10);
        FrogSim frog3 = new FrogSim(15,  2);

        System.out.println("Frog 1 Success Rate: " + frog1.runSims(5));
        System.out.println("Frog 2 Success Rate: " + frog2.runSims(5));
        System.out.println("Frog 3 Success Rate: " + frog3.runSims(5));
    }
}
