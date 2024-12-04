package cardgame;

class OutOfCardsException extends RuntimeException
{
	OutOfCardsException() {}

	OutOfCardsException(String s) {
		super(s);
	}
}