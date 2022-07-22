package radiostation;

public class Broadcast {
        private Integer contentLength;
        private Integer contentPrice;
        private String contentName;
        private String contentArtist;

        public Broadcast() {

            super();
        }

        public Broadcast(Integer contentLength, Integer contentPrice, String contentName, String contentArtist) {
            this();
            this.contentLength = contentLength;
            this.contentPrice = contentPrice;
            this.contentName = contentName;
            this.contentArtist = contentArtist;
        }

        public Integer getcontentLength() {
            return contentLength;
        }

        public void setcontentLength(String chassis) {
            this.contentLength = contentLength;

        }

        public Integer contentPrice() {
            return contentPrice;
        }

        public void setBody(String body) {
            this.contentPrice = contentPrice;
        }

        public String getcontentName() {
            return contentName;
        }

        public void setPaint(String paint) {
            this.contentName = contentName;
        }
        public String getContentArtist() {
            return contentArtist;
        }

        public void setContentArtist(String contentArtist) {
            this.contentArtist = contentArtist;
        }
    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Translation Unit [Length=").append(contentLength).append(", Income=").append(contentPrice).append(", Name=").append(contentName).append(", Artist=").append(contentArtist);
        return builder.toString();
    }

    }

