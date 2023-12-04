package mod_13;


/*
Програма повинна містити методи для реалізації наступного функціоналу:

  1 + створення нового об'єкта в https://jsonplaceholder.typicode.com/users. Можливо, ви не побачите одразу змін на сайті. Метод працює правильно, якщо у відповідь на JSON з об'єктом повернувся такий самий JSON, але зі значенням id більшим на 1, ніж найбільший id на сайті.

 2 +  оновлення об'єкту в https://jsonplaceholder.typicode.com/users. Можливо, ви не побачите одразу змін на сайті. Вважаємо, що метод працює правильно, якщо у відповідь ви отримаєте оновлений JSON (він повинен бути таким самим, що ви відправили).

 3 +  видалення об'єкта з https://jsonplaceholder.typicode.com/users. Тут будемо вважати коректним результат - статус відповіді з групи 2xx (наприклад, 200).

 4 +  отримання інформації про всіх користувачів https://jsonplaceholder.typicode.com/users

 5 +  отримання інформації про користувача за id https://jsonplaceholder.typicode.com/users/{id}

 6   отримання інформації про користувача за username - https://jsonplaceholder.typicode.com/users?username={username}
*/

/*Завдання 2

Доповніть програму методом, що буде виводити всі коментарі до останнього поста певного користувача і записувати їх у файл.

https://jsonplaceholder.typicode.com/users/1/posts Останнім вважаємо пост з найбільшим id.

https://jsonplaceholder.typicode.com/posts/10/comments

Файл повинен називатись user-X-post-Y-comments.json, де Х - id користувача, Y - номер посту.*/
/*
Завдання 3

 Доповніть програму методом, що буде виводити всі відкриті задачі для користувача з ідентифікатором X.

https://jsonplaceholder.typicode.com/users/1/todos.

Відкритими вважаються всі задачі, у яких completed = false.

*/


import java.io.IOException;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Task 1.1
		User user = createDefaultUser();
	//	final User createUser = ParsURL.sendPost(user);
	//	System.out.println("createUser = " + createUser);

		//Task 1.2
	//	final User updateUserData = ParsURL.sendPut(2, user);
	//	System.out.println("UpdateUser = " + updateUserData);

		//Task 1.3
	//	ParsURL.sendDelete(2);

		//Task 1.4
	//	List<User> checkAllUser = ParsURL.sendGetAllUsers();
	//	System.out.println("checkAllUser = " + checkAllUser);

		//Task 1.5
	 //	final User checkUserFromId = ParsURL.sendGetById(3);
	//	System.out.println("checkUserFromId = " + checkUserFromId);

		//Task 1.6
	//	final List<User> checkUserFromUsername = ParsURL.sendGetByUserName("Samantha");
	//	System.out.println("checkUserFromUsername = " + checkUserFromUsername);

		//Task 2
		//	final List<User> checkUserFromUsername = ParsURL.sendGetByUserName("Samantha");
		//	System.out.println("checkUserFromUsername = " + checkUserFromUsername);

		//Task 3
	//	final List<UserTask> checkTasksUsers = ParsURL.sendGetByPost(1, false);
	//	System.out.println("checkTasksUsers = " + checkTasksUsers);

	}

	private static User createDefaultUser() {
		User user = User.builder()
				.name("Mark Test")
				.username("Test")
				.email("test@google.com")
				.website("Test.com")
				.build();
		return user;
	}

}
