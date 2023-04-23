import random

# Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями). 
# Выдать без повторений в порядке возрастания все те числа, которые встречаются в 
# обоих наборах.
# Пользователь вводит 2 числа. n — кол-во элементов первого множества. m — кол-во 
# элементов второго множества. Затем пользователь вводит сами элементы множеств.

# n = int(input('Введите размер первого массива: '))
# some_list1 = [random.randint(0, 10) for _ in range(n)]
# m = int(input('Введите размер второго массива: '))
# some_list2 = [random.randint(0, 10) for _ in range(m)]
# print(some_list1, end=' \n')
# print(some_list2, end=' \n')
# some_set1 = set(some_list1)
# some_set2 = set(some_list2)
# print(some_set1.intersection(some_set2))
# final_list = list(some_set1.intersection(some_set2))
# print(final_list.sort)

# =============================================================================

# Задача 24: В фермерском хозяйстве в Карелии выращивают чернику. Она растёт на 
# круглой грядке, причём кусты высажены только по окружности. Таким образом, у 
# каждого куста есть ровно два соседних. Всего на грядке растёт N кустов.
# Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них выросло 
# различное число ягод — на i-ом кусте выросло ai ягод.
# В этом фермерском хозяйстве внедрена система автоматического сбора черники. Эта 
# система состоит из управляющего модуля и нескольких собирающих модулей. Собирающий 
# модуль за один заход, находясь непосредственно перед некоторым кустом, собирает 
# ягоды с этого куста и с двух соседних с ним.
# Напишите программу для нахождения максимального числа ягод, которое может собрать 
# за один заход собирающий модуль, находясь перед некоторым кустом заданной во входном 
# файле грядки.

# n = int(input('Введите количество кустов: '))
# some_list = [random.randint(3, 10) for _ in range(n)]
# print(some_list)
# summ = 0
# max_summ = 0
# for i in range(0, len(some_list)):
#     # print(some_list[i], end= '  ')
#     if i == 0:
#         # print(some_list[len(some_list)-1], some_list[i], some_list[i+1])
#         summ = some_list[len(some_list)-1] + some_list[i] + some_list[i+1]
#         # print(summ)
#         if summ > max_summ:
#             max_summ = summ
#     elif i == len(some_list)-1:
#         summ = some_list[len(some_list)-1] + some_list[len(some_list)-2] + some_list[0]
#         # print(summ)
#         if summ > max_summ:
#             max_summ = summ
#     else:
#         summ = some_list[i] + some_list[i-1] + some_list[i+1]
#         if summ > max_summ:
#             max_summ = summ
# print(max_summ)


