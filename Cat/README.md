# JavaGit
Урок 1. Понятие класса и объекта

Создайте 5–7 кошек, вызовите у них различные методы:

Выведите в консоль вес созданных кошек.

Покормите двух кошек, после этого распечатайте их вес (убедитесь, что вес изменился).

Перекормите кошку, чтобы ее статус стал Exploded.

«Замяукайте» кошку до статуса Dead.
  
Урок 2. Метод, параметры, return

Создайте в классе Cat метод, который возвращает сумму съеденной еды текущей кошки.

Создайте в классе Cat метод «Сходить в туалет» pee(), который уменьшает вес кошки и что-нибудь печатает.

Протестируйте верную работу метода возврата съеденной еды:

Создайте кошку.

Покормите кошку кормом весом 150.00 и 100.0 грамм.

Вызовите метод pee() несколько раз.

Распечатайте значение съеденного корма, в консоль должно быть выведено значение: 250.00 граммов.

Урок 3. Статические методы и переменные

Создайте у класса Cat статическую переменную count, которая увеличивается на 1, если кошку создали, и убывает на 1, если кошка взорвалась или умерла.

Создайте статический метод getCount(), который возвращает количество кошек.

Придумайте способ, который поможет проверить, жива ли кошка, на основе значения её веса. Используя это, запретите неживой кошке есть, пить, ходить в туалет, выполняя проверку веса внутри методов, которые изменяют вес кошки.
 
Урок 4. Константы и Enum

Создайте в классе Cat константы: «количество глаз», «минимальный вес», «максимальный вес».

Создайте enum Color с окрасами кошек.

Урок 5. Создание объектов и конструктор

Сделайте в классе Cat ещё один конструктор, чтобы можно было создать кошку с весом, переданным в конструктор.

Создайте в главном классе Loader метод генерации котёнка private static Cat getKitten(). Он должен возвращать кошку с весом 1100.00 грамм с помощью конструктора, в который передаём вес кошки.

Создайте три объекта класса Cat в методе main(), используя метод getKitten().

Урок 6. Инкапсуляция, геттеры и сеттеры

В классе Car проекта RoadController создайте геттеры и сеттеры для всех переменных класса.

Создайте в классе Cat переменную, в которой хранится окрас. Напишите геттер и сеттер для окраса.

Урок 7. Копирование объектов

Сделайте метод создания «глубокой» копии кошки. Это означает, что все параметры одной кошки равны параметрам другой. Используйте для этого метод копирования или конструктор копирования.
