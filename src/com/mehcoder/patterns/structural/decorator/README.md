### ****Декоратор(Decorator)****

Мы создаём интерфей и класс реализующий его. Дальше нам нужно расширить имеющийся функционал этого класса. Для этого мы создаём вторую реализацию(декоратор) этого интерфейса, в которой будет находиться с помощью композиции первая реализация, и реализуем методы интерфейса. В них мы расширяем логику первоначального класса используя его методы в реализации текущих методов. В клиентском коде мы создам объект первоначального класса и если нужно его расширить дополнительным функционалом, создаём объект нашего декоратор, передавая ему первоначальный объект(оборачиваем этот объект декоратором, для предоставления дополнительного функционала клиенту)