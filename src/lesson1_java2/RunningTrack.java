package lesson1_java2;

public class RunningTrack implements Obstacles {
    private String name;
    private  int length;
    private int height;

    public RunningTrack(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int detHeight() {
        return 0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void wall() {

    }

    @Override
    public void track() {

    }
}
