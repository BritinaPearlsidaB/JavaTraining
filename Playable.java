interface Playable {
    void play();
    void stop();
      
}
class Mp3 implements Playable{
    public void play(){
        System.out.println("MP3 can play now");
    }
    public void stop(){
        System.out.println("MP3 is stopped now");
    }
}
class Radio implements Playable{
    @Override
    public void play(){
        System.out.println("Radio can play now");
    }
    @Override
    public void stop(){
        System.out.println("Radio is stopped now");
    }

    public static void main(String args[]){
        Mp3 mp3=new Mp3();
        Radio radio=new Radio();
        mp3.play();
        mp3.stop();
        radio.play();
        radio.stop();
    }



}