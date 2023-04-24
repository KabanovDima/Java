import time
import random

# Задача №31. Общее обсуждение
# Последовательностью Фибоначчи называется
# последовательность чисел a0, a1, ..., an, ..., где a0 = 0, a1 = 1, 
# ak = ak-1 + ak-2 (k > 1).
# Требуется найти N-е число Фибоначчи
# Input: 7
# Output: 21
# Задание необходимо решать через рекурсию

# n = 0, an = 0
# n = 1, an = 0

# # Решение через рекурсию

# n = int(input())


# def fib(n):
#     if n in (0, 1):
#         return n
#     return fib(n - 1) + fib(n - 2)
# start = time.perf_counter()
# print(fib(n))
# end = time.perf_counter()
# duration = end - start

# # Решение через цикл

# def fib_while(n):
#     first = 0
#     second = 1
#     temp_numb = first + second
#     count = 2
#     while count < n:
#         first, second = second, temp_numb
#         temp_numb = first + second
#         count +=1
#     print(temp_numb)
# start = time.perf_counter()
# fib_while(n)
# end = time.perf_counter()
# duration1 = end - start

# print(duration / duration1)

# =========================================================================
# =========================================================================

# Задача №33. Решение в группах
# Хакер Василий получил доступ к классному журналу и
# хочет заменить все свои минимальные оценки на
# максимальные. Напишите программу, которая
# заменяет оценки Василия, но наоборот: все
# максимальные – на минимальные.
# Input: 5 -> 1 3 3 3 4
# Output: 1 3 3 3 1

# =========================================================================
# =========================================================================

# Дан список интов, повторяющихся элементов в списке нет. Нужно преобразовать это
# множество в строку, сворачивая соседние по числовому ряду числа в диапазоны.
# Примеры:
# [1,4,5,2,3,9,8,11,0] => "0-5,8-9,11" {0, 1, 2, 3, 4, 5, 8, 9, 11}
# [1,4,3,2] => "1-4"
# [1,4] => "1,4"

some_list = [-5,1,4,5,2,3,9,8,11,0,13]
some_list.sort()
print(some_list)
result_list = []
temp_list = []
for i in range(0, len(some_list) - 1):
    if some_list[i + 1] - some_list[i] == 1:
        temp_list.append(some_list[i])
    else:
        temp_list.append(some_list[i])
        result_list.append(temp_list)
        temp_list = []
# if temp_list:
#     result_list.append(temp_list)
if some_list[-1] - some_list[-2] == 1:
    result_list[-1].append(some_list[-1])
else:
    result_list.append([some_list[-1]])
print(result_list)

print_list = []
for i in result_list:
    if len(i) > 1:
        print_list.append(f'{i[0]} - {i[-1]}')
    else:
        print_list.append(i[0])
print(*print_list, sep=',')