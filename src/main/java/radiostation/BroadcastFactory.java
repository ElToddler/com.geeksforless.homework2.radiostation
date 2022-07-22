package radiostation;

public class BroadcastFactory {
    public ContentActions getcontent(ContentTypes type) {
        ContentActions toReturn;
        toReturn = null;
        switch (type) {
            case SONG:
                toReturn = new Song();
                break;
            case INTERVIEW:
                toReturn = new Interview();
                break;
            case AD:
                toReturn = new Ad();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}
