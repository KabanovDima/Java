import random
import time

# Срезы =====================================

# some_str = 'hello'
# for letter in some_str:
#     print(letter)

# for ind in range(0, len(some_str)):
#     print(some_str[ind])

# print(some_str[0])

# print(some_str[1:4:2]) #[3:] [:3] [:] [::-1]

# =================== Списки (массивы) =====================================

# some_list = [1, 'fds', True, [1, 2, 3], {1: 2}, (5, 7)]
# print(some_list) 
# print(some_list[0])
# print(some_list[-1])
# print(some_list[2:4])

# /////

# some_list = []
# for _ in range(10):
#     number = int(input())
#     some_list.append(number)
# print(some_list)

# /////

# some_list = [int(input()) for _ in range(10)]
# print(some_list)

# //////

# some_list = []
# for _ in range(10):
#     number = random.randint(1,10)
#     some_list.append(number)
# print(some_list)

# ///////////

# some_list = [random.randint(1, 10) for _ in range(10)]
# print(some_list)

# подсчет кол-ва нужных элементов в цикле //////////////

# some_list = []
# for _ in range(10):
#     number = random.randint(1,10)
#     some_list.append(number)
# print(some_list)
# print(some_list.count(7))
# print(7 in some_list)

# =================== Кортеж (1, 2) =====================================
# тот же список, но не изменяемыйТип данных tuple

# a = []
# b = (1, 2)
# print(type(a))
# print(type(b))

# //

# a = [1, 2, 3]
# b = tuple(a)
# for i in b:
#     print(i)
# print(b[0])

# =================== Множества =====================================
# только уникальные эелемнты и нет порядка. Тип данных set. Пройтись циклом можно, 
# но взять по индексу нельзя

# a = {1, 2, 3}
# print(type(a))
# # a = {} # пустой словарь
# # a = set() # пустое множество
# # for i in range(1, 10):
# #     a.add(i)
# # print(a)

# //
# some_list = [random.randint(1, 10000) for i in range(10 ** 6)]
# some_set = set(some_list)

# start = time.perf_counter()
# print(9999 in some_list)
# end = time.perf_counter()
# duration1 = end - start

# start = time.perf_counter()
# print(9999 in some_set)
# end = time.perf_counter()
# duration2 = end - start

# print(duration1/duration2)

# //

# some_list = [random.randint(1, 10000) for i in range(10 ** 7)]
# some_set = set(some_list)

# start = time.perf_counter()
# print(11000 in some_list)
# end = time.perf_counter()
# duration1 = end - start

# start = time.perf_counter()
# print(11000 in some_set)
# end = time.perf_counter()
# duration2 = end - start
# print(duration1/duration2)

# =================== Словари =====================================

# some_dict = {'яблоко': 'apple', 'аельсин': 'orange'}
# print(some_dict.get('груша'))
# print(some_dict['груша'])

# //

# some_dict = {'яблоко': 'apple', 'аельсин': 'orange'}
# print(some_dict.get('груша', 'такого ключа нет'))
# some_dict['виноград'] = 'grape'
# print(some_dict)

# //
# some_dict = {'яблоко': 'apple', 'аельсин': 'orange'}
# print(some_dict.get('груша', 'такого ключа нет'))
# some_dict['яблоко'] = 'grape'
# print(some_dict)

# неизменяемые типы данных:
# str:
# a = 'hello'
# print(id(a))
# a = a + ' world'
# print(id(a))
# print(a)
# //
# int
# float
# bool
# tuple
# frozenset

# изменяемые
# list
# set
# dict

# =================== Задачи =====================================

# Дан список чисел. Определите, сколько в нем встречается различных чисел.
some_list = []
for _ in range(10):
    number = random.randint(1,10)
    some_list.append(number)
print(some_list)
some_set = set(some_list)
print(some_set)
print(len(some_set))
