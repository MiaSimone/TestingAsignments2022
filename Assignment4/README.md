
### Run Jacoco:
mvn clean test

### Run PiTest in root of project:
mvn test-compile org.pitest:pitest-maven:mutationCoverage

### Play Snake
Run the SnakeGame.java file

### Testing Mockito
#### 1. How do you verify that a mock was called?
Using mock.verify()
```Java
import static org.mockito.Mockito.*;

// mock creation
List mockedList = mock(List.class);

// using mock object - it does not throw any "unexpected interaction" exception
mockedList.add("one");
mockedList.clear();

// selective, explicit, highly readable verification
verify(mockedList).add("one");
verify(mockedList).clear();
```
Using stub methods
```Java
// you can mock concrete classes, not only interfaces
LinkedList mockedList = mock(LinkedList.class);

// stubbing appears before the actual execution
when(mockedList.get(0)).thenReturn("first");

// the following prints "first"
System.out.println(mockedList.get(0));

// the following prints "null" because get(999) was not stubbed
System.out.println(mockedList.get(999));
```

#### 2. How do you verify that a mock was NOT called?
Using never().clear()
```Java
List<String> mockedList = mock(MyList.class);
mockedList.size();
verify(mockedList, never()).clear();
```

#### 3. How do you specify how many times a mock should have been called?
Using times().size()
```Java
List<String> mockedList = mock(MyList.class);
mockedList.size();
verify(mockedList, times(999)).size();
```

#### 4. How do you verify a mock was called with specific arguments?
Using mockedList.add(“argument”)
```Java
List<String> mockedList = mock(MyList.class);
mockedList.add("test");
verify(mockedList).add("test");
```

#### 5. How do you use a predicate to verify the properties of the arguments given to a call to the mock?
Using any
```Java
Foo mockFoo = mock(Foo.class);
when(mockFoo.bool(anyString(), anyInt(), any(Object.class))).thenReturn(true);
```
