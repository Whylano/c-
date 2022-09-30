
import java.util.UUID;

public class bus {
    private final int maxPassengers;
    private int nowPassengers;
    private int busfee;
    private UUID BusNumber;
    private int Oil;
    private int NowSpeed;
    private int busStatus;

    public bus(int maxPassengers, int nowPassengers){
        this.maxPassengers = maxPassengers;
        this.nowPassengers = nowPassengers;
        this.BusNumber = BusNumberOccurrence();
    }
    private UUID BusNumberOccurrence(){
        return UUID.randomUUID();
    }


    void setChangeSituation(int nowPassengers,int maxPassengers,int busStatus){
            ;

    }
    void setDriveing(int oil){

    }
    void setChangeSpeed(int busStatus, int oil){
    }
    void setBoarding(){

    }
}


