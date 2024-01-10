package library.electron.updatelib;

import java.util.EventListener;

public interface ActionListener extends EventListener {
    void reveivedUpdates();
    void updateFailed();
}
