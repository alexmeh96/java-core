### ****Заместитель(Proxy)****

Используется, когда нужно заменить незаметно для клиента имеющийся объект с его функциональностью на новый, который будет добавлять сквозную функциональность к первому. Прокси-класс реализует такой же инерфейс как и исходный класс, так же в прокси-классе происходит создание объекта исходного класса. Затем при реализации методов у пркси-класса происходит добавление дополнительной(сквозной) функциональности к методам исходного объекта