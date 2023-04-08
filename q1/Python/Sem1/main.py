# 1. Сумма трех
# Посчитайте сумму трех введенных целых чисел

# print('Enter 1st number: ')
# a = input()
# print('Enter 2nd number: ')
# b = input()
# print('Enter 3rd number: ')
# c = input()
# print('Summ = ', int(a) + int(b) + int(c))

# 2. Площадь
# Пользователь вводит стороны прямоугольника, выведите его площадь

# print('Enter the 1st side length: ')
# a = int(input())
# print('Enter the 2nd side length: ')
# b = input()
# print('The area of the figure is: ', a * int(b))

# 3. 1. Одинаковая четность
# Даны два целых числа: A, B. Проверить истинность высказывания: 
# "Числа A и B имеют одинаковую четность".

# print('Enter 1st number: ')
# a = int(input())
# print('Enter 2nd number: ')
# b = int(input())
# if(a%2 == b%2):
#     print('The both numbers have the same parity')
# else:
#     print('The numbers have a different parity')

# 4. Одно положительное
# Даны три целых числа: A, B, C. Проверить истинность высказывания: 
# "Хотя бы одно из чисел A, B, C положительное".

# print('Enter 1st number: ')
# a = int(input())
# print('Enter 2nd number: ')
# b = int(input())
# print('Enter 3rd number: ')
# c = int(input())
# if((a >= 0) | (b >= 0) | (c >= 0)):
#     print('Хотя бы одно введенное число положительное')
# else:
#     print('все числа отрицательные')

# 5 Меньшее из двух
# Пользователь вводит два целых числа. Выведите меньшее из них.

# print('Enter 1st number: ')
# a = int(input())
# print('Enter 2nd number: ')
# b = int(input())
# if (a > b) :
#     print(b)
# else:
#     print(a)

# Задача №1. Решение в группах
# Семинар 1. Ввод-вывод, операторы ветвления
# За день машина проезжает n километров. Сколько
# дней нужно, чтобы проехать маршрут длиной m
# километров? При решении этой задачи нельзя
# пользоваться условной инструкцией if и циклами.
# Input:
# n = 700
# m = 750
# Output:
# 2
# import math
# n = int(input('Enter n: '))
# m = int(input('Enter m: '))
# print(math.ceil(m/n))

# Задача №3. Решение в группах
# В некоторой школе решили набрать три новых
# математических класса и оборудовать кабинеты для
# них новыми партами. За каждой партой может сидеть
# два учащихся. Известно количество учащихся в
# каждом из трех классов. Выведите наименьшее
# число парт, которое нужно приобрести для них.
# Input: 20 21 22(ввод чисел НЕ в одну строку)
# Output: 32

# a = int(input('Enter the number of students 1st class: '))
# b = int(input('Enter the number of students 2nd class: : '))
# c = int(input('Enter the number of students 3rd class: : '))
# print((int((a+b+c)/2))+ (a+b+c)%2)

# Задача №7. Решение в группах
# Дано натуральное число. Требуется определить,
# является ли год с данным номером високосным. Если
# год является високосным, то выведите YES, иначе
# выведите NO. Напомним, что в соответствии с
# григорианским календарем, год является
# високосным, если его номер кратен 4, но не кратен
# 100, а также если он кратен 400.
# Input: 2016
# Output: YES

# a = int(input('Enter the year: '))
# print(a%4)
# print(a%100)
# if(((((a % 4) == 0) & ((a % 400) == 0)) | ((a % 100) != 0))):
#     print('The year is leap')
# else:
#     print('The year isn\'t a leap')
