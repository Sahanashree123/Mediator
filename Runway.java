package Mediator;
public class Runway implements Command{
    private IAtc atcMediator;
    Runway(IAtc atcMediator)
    {
        this.atcMediator=atcMediator;
    }
    @Override
    public void land()
    {
        System.out.println("Runway is available for landing");
        atcMediator.setAvailabilityStatus(true);
    }
}
