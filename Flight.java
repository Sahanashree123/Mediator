package Mediator;
public class Flight implements Command{
    private IAtc atcMediator;
    Flight(IAtc atcMediator)
    {
        this.atcMediator=atcMediator;
    }
    @Override
    public void land() {
       if(atcMediator.isAvailable())
       {
        System.out.println("Landed successfully");
        atcMediator.setAvailabilityStatus(false);//runway is occupied
       }
        else{
            System.out.println("waiting for runway");
        }
    }
    public void readyToLand()
    {
        System.out.println("Landing initiated");
    }
    public void parked()
    {
        System.out.println("Flight is parked");
        atcMediator.setAvailabilityStatus(true);//runway is available
    }
}
