package game;
import engine.session;

public class logicAdapter implements logic {
    private int ticks;
    private long nextsecondnanos;
    private int tickReport;
    private session parentSession;

    public void setParentSession(session instance) {
        parentSession = instance;
    }

    public logicAdapter() {
        ticks = 0;
        nextsecondnanos = 0;
        tickReport = 0;
    }

    public int getTickReport() {
        return tickReport;
    }

    @Override
    public void init(){

    }

    @Override
    public void input() {

    }

    @Override
    public void render() {

    }

    @Override
    public void update() {
        ticks++;
        long theTime = System.nanoTime();
        if(nextsecondnanos < theTime) {
            nextsecondnanos = theTime + 1000000000;
            tickReport = ticks;
            ticks = 0;
        }
    }

    @Override
    public void disconnect() {
        parentSession.destroy();
    }

    @Override
    public void cleanup() {
        tickReport = 0;
    }
}

