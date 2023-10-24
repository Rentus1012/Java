public class Television
{
    private int Volume;
    private int Channel;
    private String isOn;

    public void setChannel(int sc)
        {Channel = sc;}

    public void setChannel(char ch)
    {
        if (ch == '+')
        {
            Channel = Channel + 1;
            if(Channel > 99)
                Channel = 0;
        }
        if (ch == '-')
        {
            Channel = Channel - 1;
            if(Channel < 0)
                Channel = 99;
        }
    }
    public void setVolume(int sv)
        {Volume = sv;}
    public void turnOn()
        {isOn = "ÄÑÁü";}
    public void turnOff()
        {Channel = 0;Volume = 0;isOn = "²¨Áü";}

    public String toString()
    {return String.format("(%s, ¼Ò¸®: %d, Ã¤³Î: %d)", isOn, Volume, Channel);}

    public int getChannel()
        {return Channel;}
    public int getVolume()
        {return Volume;}
}
