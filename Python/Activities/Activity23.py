from tkinter import N
import pytest

def test_sumOfList(get_list):
    sum=0
    for x in get_list:
        sum=sum+x
    assert sum == 66

