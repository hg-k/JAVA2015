package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import Entity.CMember;

public class DAO {
		public Object read(String fileName) {
			Object object = null;				
				try {
					ObjectInputStream in;
					in = new ObjectInputStream(new FileInputStream(fileName));
					object = in.readObject();
					in.close();
				} catch (IOException | ClassNotFoundException e) {
				
					e.printStackTrace();
				}
				return object;
			} 
				
		public void write(Object object, String fileName) {
			
			//serialize
			
			try {
				ObjectOutputStream out =
						new ObjectOutputStream(new FileOutputStream(fileName));
				out.writeObject(object);
				out.close();
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}


		public void makeFile(Vector<CMember> serveArr) {
			// TODO Auto-generated method stub
			
		}

	}

