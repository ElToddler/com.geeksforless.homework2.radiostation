package radiostation2;

import java.io.IOException;

public class SongDetails extends ContentGenerator {
    public void SongName() throws IOException {
        StringContentDetails(1, 0);
    }
    public void SongArtist() throws IOException {
        StringContentDetails(0, 0);
}
    public void SongLength() throws IOException {
        intContentDetails(2, 0);
    }


}

