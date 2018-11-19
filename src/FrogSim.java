public class FrogSim {
    private int goalDist;
    private int maxHops;

    public FrogSim(int dist, int numHops){
        goalDist = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
        int negrand = (int)-(Math.random() * 20);
        int rand = (int)(Math.random() * 20);
        if(Math.random() > .25)
            return rand;
        return negrand;
    }

    public boolean simulate(){
        int pos = 0;
        for(int count = 0;count<maxHops;count++){
            pos += hopDistance();
            System.out.print(" " + pos + " ");
            if(pos >= goalDist) {
                System.out.println("Success Final Distance: " + pos);
                return true;
            }
            else if(pos < 0){
                System.out.println("Failed Reached Negative Distance");
                return false;
            }
        }
        System.out.println("Failed Final Distance: " + pos);
        return false;
    }

    public double runSims(int num){
        int trues = 0;
        for(int i = 0;i < num;i++){
            if(simulate()){
                trues++;
            }
        }
        return (double)trues/num;
    }
}
