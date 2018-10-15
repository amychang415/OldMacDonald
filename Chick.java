class Chick implements Animal 
{     
     private String myType;     
     private String mySound;
     private String mySoundTwo;      
     public Chick(String type, String sound, String soundTwo)     {         
         myType = type;         
         mySound = sound;
         mySoundTwo = soundTwo;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";
         mySoundTwo = "unknown";     
     }      
     public String getSound()
     {
     	if (Math.random() > 0.5)
     	{
     		return mySound;
     	}
     	else
     	{
     		return mySoundTwo;
     	}
     }     
     public String getType(){return myType;} 
}
