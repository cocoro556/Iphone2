public class SmartPhone extends Phone implements Mp3Player, NewFunction {
	// インターフェイスのメソッドを実装
	// Phone クラスからの継承されたメソッドはすでに実装されている

	// Mp3Player インターフェイスのメソッド実装
	@Override
	public void play() {
		System.out.println("再生");
	}

	@Override
	public void stop() {
		System.out.println("停止");
	}

	@Override
	public void next() {
		System.out.println("次へ");
	}

	@Override
	public void back() {
		System.out.println("戻る");
	}

	// NewFunction インターフェイスのメソッド実装
	@Override
	public void call() {
		System.out.println("電話");
	}

	@Override
	public void mail() {
		System.out.println("メール");
	}

	@Override
	public void photo() {
		System.out.println("写真");
	}

	@Override
	public void internet() {
		System.out.println("インターネット");
	}
}
