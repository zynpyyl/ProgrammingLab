package day45_tasks;

public interface SearchContext {

    void findElement(String locator);

    void findElements(String locator);

}

/*
1. Create an interface named SearchContext
				Abstract methods:
					findElement(String locator);
					findElements(String locator);
 */