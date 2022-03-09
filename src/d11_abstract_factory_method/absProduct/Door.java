package d11_abstract_factory_method.absProduct;

import d11_abstract_factory_method.etc.DoorStatus;

public abstract class Door {
    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    protected abstract void doClose();

    protected abstract void doOpen();

    public void close() {
        if(doorStatus == DoorStatus.CLOSED) return;

        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    public void open() {
        if(doorStatus == DoorStatus.OPENED) return;

        doOpen();
        doorStatus = DoorStatus.OPENED;
    }
}
