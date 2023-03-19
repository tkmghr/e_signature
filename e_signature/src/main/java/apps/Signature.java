package apps;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class Signature {
	
	//各種フォルダ取得（カレント・アップロード用・ダウンロード用）
	public static String currentDirectoryPath = System.getProperty("user.dir");
	public static String upload_path = currentDirectoryPath + "\\upload\\";
	public static String download_path = currentDirectoryPath + "\\download\\";


	
	public void do_signature(ArrayList<String> pdf_name_list, String sign_mode, String sign_value, String sign_certificate) 
	throws IOException{
		
		//秘密鍵と電子証明書を読み込み
		if(sign_mode.equals("1")) {
			
		}else if (sign_mode.equals("2")) {
			System.out.println("MNカード読み取りは未対応です");
		}else {
			System.out.println("ここに来ることはあり得ません。");
		}
		
		for (String pdf_name : pdf_name_list) {
			File file = new File("input.pdf");
			PDDocument document = PDDocument.load(file);
			
		}
	}
	
	
	//メイン関数
	public static void main(String[] args) {
		System.out.println(upload_path);
		System.out.println(download_path);
		

	}

}
