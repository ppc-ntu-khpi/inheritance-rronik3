# Практична робота "Реалізація успадкування"
## Обрана тварина: Пантера
![](https://github.com/ppc-ntu-khpi/inheritance-rronik3/blob/master/images/Panther.png)

Пантера — це граційний хижак, який:
  - переслідує здобич у джунглях,
  - крадеться безшумно,
  - видає гучне гарчання

## Ієрархія класів
  - Animal — базовий клас з основними характеристиками та методами всіх тварин (наприклад, eat(), speak()).
  - Predator — підклас, який наслідує Animal і додає поведінку, притаманну хижакам (метод hunt()).
  - Panther — підклас, який наслідує Predator і реалізує унікальну поведінку пантери (метод stalk(), додаткове поле subspecies).
  - TestPanther — тестовий клас, який створює об'єкт Panther і викликає всі її методи.

## UML-діаграма
<img src="https://github.com/ppc-ntu-khpi/inheritance-rronik3/blob/master/images/%D0%B4%D1%96%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%B0.png" width="100%"/>

## Результат роботи програми
![](https://github.com/ppc-ntu-khpi/inheritance-rronik3/blob/master/images/result.png)
