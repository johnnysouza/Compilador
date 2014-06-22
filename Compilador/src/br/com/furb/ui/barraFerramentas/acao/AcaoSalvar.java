package br.com.furb.ui.barraFerramentas.acao;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AcaoSalvar {

	public static void salvar(String absolutePath, String buffer) throws IOException {
		FileOutputStream fileOutPutStream = new FileOutputStream(absolutePath, false);
		BufferedOutputStream bufferedOutPutStream = new BufferedOutputStream(fileOutPutStream);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutPutStream);
		objectOutputStream.writeObject(buffer);
		objectOutputStream.flush();
		objectOutputStream.close();

		bufferedOutPutStream.flush();
		bufferedOutPutStream.close();

		fileOutPutStream.flush();
		fileOutPutStream.close();

	}
}
