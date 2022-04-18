import pytest
	

def test_sumOfNumbers():
    sum=4+6
    assert sum == 10
	

def test_subOfNumbers():
    sub =23 -3
    assert sub == 21
	
@pytest.mark.activity
def test_multiply():
    multi=3*3
    assert multi ==9

@pytest.mark.activity
def test_quitione():
    quotient=56/2
    assert quotient==48
