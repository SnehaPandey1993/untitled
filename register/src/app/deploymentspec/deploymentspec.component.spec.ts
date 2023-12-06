import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeploymentspecComponent } from './deploymentspec.component';

describe('DeploymentspecComponent', () => {
  let component: DeploymentspecComponent;
  let fixture: ComponentFixture<DeploymentspecComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeploymentspecComponent]
    });
    fixture = TestBed.createComponent(DeploymentspecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
