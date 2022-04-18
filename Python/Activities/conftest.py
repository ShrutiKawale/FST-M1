import pytest
@pytest.fixture
def get_list():
   my_list=list((1,2,3,4,5,6,7,8,9,10,11))
   return my_list

@pytest.fixture	
def wallet_amount():
   amount = 0
   return amount