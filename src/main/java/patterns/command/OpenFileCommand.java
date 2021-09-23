package patterns.command;

public class OpenFileCommand implements Command{
    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open patterns.command is forwarding request to openFile method
        this.fileSystem.openFile();
    }
}
