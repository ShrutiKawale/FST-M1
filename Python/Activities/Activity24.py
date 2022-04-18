import pytest



@pytest.mark.parametrize("earned,spent,left_amount", [(40,30,10),(55,40,15),(100,70,30)])
def test_wallet(wallet_amount,earned,spent,left_amount):
    wallet_amount=earned+wallet_amount
    calculated_amount=wallet_amount-spent
    assert calculated_amount==left_amount
