package Application;

import Entities.Browser;
import Entities.Phone;
import Entities.Player;
import Entities.Safari;

public class Program {

    public static void main(String[] args) {
        Player iphonePlayer = new Player();
        iphonePlayer.selectMusic("Hard Day's Night");
        iphonePlayer.playMusic();
        iphonePlayer.pauseMusic();
        System.out.println();

        Phone iphoneCall = new Phone();
        iphoneCall.call("11 99999-9999");
        iphoneCall.answerCall();
        iphoneCall.voiceMail();
        System.out.println();

        Browser iphoneSafari = new Safari();
        iphoneSafari.displayPage();
        iphoneSafari.newTab();
        iphoneSafari.refreshPage();
    }
}
