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
        {isOn = "����";}
    public void turnOff()
        {Channel = 0;Volume = 0;isOn = "����";}

    public String toString()
    {return String.format("(%s, �Ҹ�: %d, ä��: %d)", isOn, Volume, Channel);}

    public int getChannel()
        {return Channel;}
    public int getVolume()
        {return Volume;}
}
