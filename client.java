import java.io.*;
import java.net.*;

class client
{
	public static void main(String [] args)
	{
		try
		{
			Socket S = new Socket("192.168.106.129",1201);
			DataInputStream Din = new DataInputStream(S.getInputStream());
			DataOutputStream Dout = new DataOutputStream(S.getOutputStream());
			BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			String msgin = "", msgout = "";
			while(!msgin.equals("end"))
			{
				msgout = BR.readLine();
				Dout.writeUTF(msgout);
				msgin = Din.readUTF();
				System.out.println(msgin);
			}
		}
		catch(Exception e)
		{
		}
	}
}

