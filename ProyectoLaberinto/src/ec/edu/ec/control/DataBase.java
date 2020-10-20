package ec.edu.ec.control;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DataBase<T> {

    protected List<T> listObjects;
    private final String file;
    private final String path = System.getProperty("user.home") + "/Desktop/Database";
    private File thisFile, directory;

    public DataBase(String nameFile) {
        this.file = nameFile + ".ddr";
        this.listObjects = new ArrayList<>();
        directory = new File(path);
        directory.mkdirs();
        createFile(this.file);
    }

    private void createFile(String nameFile) {
        thisFile = new File(directory, nameFile);
        if (!thisFile.exists()) {
            try {
                System.out.println("Fichero creado");
                thisFile.createNewFile();
                tDefault();
            } catch (IOException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    protected final void writeFile() {
        boolean fly = true;
        for (T object : listObjects) {
            if (fly) {
                try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(thisFile))) {
                    oos.writeObject(object);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    fly = false;
                }
            } else {
                try (ObjectOutput oos = new MyObjectOutputStream(new FileOutputStream(thisFile, true))) {
                    oos.writeObject(object);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    protected final void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInput ois = new ObjectInputStream(new FileInputStream(thisFile))) {
            while (true) {
                listObjects.add((T) ois.readObject());
            }
        } catch (EOFException e) {

        }
    }

    protected abstract void tDefault();

    class MyObjectOutputStream extends ObjectOutputStream {

        public MyObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        public MyObjectOutputStream() throws IOException, SecurityException {
        }

        @Override
        protected void writeStreamHeader() throws IOException {
//        super.writeStreamHeader(); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
