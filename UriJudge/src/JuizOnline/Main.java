package JuizOnline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static String pre = "", pos = "", in = "";
	Main nodoEsquer;
	int data;
	Main nodoDire;
	public Main(int nodeData) {
		data = nodeData;
		nodoEsquer = nodoDire = null;
	}
	public Main() {}
	public void insert(int insertValue) {

		if (insertValue < data) {
			if (nodoEsquer == null)
				nodoEsquer = new Main(insertValue);
			else
				nodoEsquer.insert(insertValue);
		} else if (insertValue > data) {
			if (nodoDire == null)
				nodoDire = new Main(insertValue);
			else
				nodoDire.insert(insertValue);
		}
	}
	private Main raiz;
	public void Tree() {
		raiz = null;
	}
	public void insertNode(int insertValue) {
		if (raiz == null)
			raiz = new Main(insertValue);
		else
			raiz.insert(insertValue);
	}
	public void imprimir() {
		imprimir(raiz);
	}
	public void imprimir(Main node) {
		if (node == null) {
			return;
		}
		pre = pre + (node.data + " ");
		imprimir(node.nodoEsquer);
		in = in + (node.data + " ");
		imprimir(node.nodoDire);
		pos = pos + (node.data + " ");
	}
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] cas = input.readLine().split(" ");
		int casos = Integer.parseInt(cas[0]);

		for (int i = 1; i <= casos; i++) {
			String[] ns = input.readLine().split(" ");
			int n = Integer.parseInt(ns[0]);
			pre = "";
			pos = "";
			in = "";
			Main arvore = new Main();
			arvore.Tree();
			String[] qtd = input.readLine().split(" ");
			for (int j = 0; j < qtd.length; j++) {
				int a = Integer.parseInt(qtd[j]);
				arvore.insertNode(a);

			}
			System.out.println("Case " + i + ":");
			arvore.imprimir();

			if (pre.length() > 0) {
				pre = pre.substring(0, pre.length() - 1);
			}
			if (in.length() > 0) {
				in = in.substring(0, in.length() - 1);
			}
			if (pos.length() > 0) {
				pos = pos.substring(0, pos.length() - 1);
			}

			System.out.println("Pre.: " + pre);
			System.out.println("In..: " + in);
			System.out.println("Post: " + pos);
			System.out.println();
		}
	}
}