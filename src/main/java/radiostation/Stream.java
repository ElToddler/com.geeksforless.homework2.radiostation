package radiostation;

import java.io.IOException;

public class Stream {
    static class Main {
        public static void main(String[] args) {
            BroadcastFactory factory = new BroadcastFactory();
            SongName songPlaylistXLS = new SongName();

            ContentActions song = factory.getcontent(ContentTypes.SONG);
            ContentActions interview = factory.getcontent(ContentTypes.INTERVIEW);
            ContentActions ad = factory.getcontent(ContentTypes.AD);

            song.play();
            ad.countIncome();
            interview.saveToHDD();
        }
    }
}
