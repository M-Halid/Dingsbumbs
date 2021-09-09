package unpacker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unpack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Verwendung: Unpack <source>");
			return;
		}

		String srcFilename = args[0];
		String destDir = "contents";

		// open zip file stream
		ZipInputStream is = null;
		try {
			is = new ZipInputStream(new FileInputStream(srcFilename));
		} catch (FileNotFoundException e) {
			System.out.println("Kann Datei nicht Oeffnen.");
			return;
		}

		// extract zip entries
		try {
			ZipEntry entry;
			while ((entry = is.getNextEntry()) != null) {
				extractEntry(is, entry, destDir);
			}
		} catch (IOException e) {
			System.out.println("Fehler beim entpacken.");
			return;
		} finally {
			try {
				is.close();
			} catch (IOException e) {
			}
		}

	}

	private static void extractEntry(ZipInputStream is, ZipEntry entry,
			String destDir) {
		File destFile = new File(destDir, entry.getName());

		// create folder or extract single entry from zip
		if (entry.isDirectory())
			destFile.mkdirs();
		else {
			destFile.getParentFile().mkdirs();

			// open output stream
			OutputStream os = null;
			try {
				os = new FileOutputStream(destFile);
			} catch (FileNotFoundException e) {
				System.out.println("Fehler beim Erzeugen der Zieldatei "
						+ destFile);
				return;
			}

			System.out.println("Entpacke " + entry.getName());

			// write entry
			try {
				byte[] buffer = new byte[4096];
				int length;
				while ((length = is.read(buffer)) != -1) {
					os.write(buffer, 0, length);
				}
			} catch (IOException e) {
				System.out.println("Fehler beim Entpacken des Eintrags "
						+ entry.getName());
				return;
			} finally {
				try {
					os.close();
				} catch (IOException e) {
				}
			}

		}

	}

}