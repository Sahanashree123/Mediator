package Mediator;
public interface IAtc
{
    public void registerFlight(Flight flight);
    public void registerRunway(Runway runway);
    public void setAvailabilityStatus(Boolean status);
    public Boolean isAvailable();
}