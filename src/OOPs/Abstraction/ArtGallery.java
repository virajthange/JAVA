package OOPs.Abstraction;

abstract class Artist {
    abstract void artCration();
    abstract void roolUsage();
    void sketching() {
        System.out.println("Make sketch before painting");
    }
}

public class ArtGallery {
    public static void main(String[] args) {
//        Can't create an object of abstract class
        Artist artist = new Artist() {
            @Override
            void artCration() {
                System.out.println("Implementing art creation");
            }

            @Override
            void roolUsage() {

                System.out.println("Implementing rool usaege");
            }
        };

        artist.artCration();
        artist.roolUsage();




    }
}
